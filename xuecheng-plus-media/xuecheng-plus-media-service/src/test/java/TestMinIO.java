import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import org.junit.jupiter.api.Test;

/**
 * @author maxinkai
 * @description
 * @date 2023/10/27 18:55
 **/
public class TestMinIO {

    static MinioClient minioClient =
            MinioClient.builder()
                    .endpoint("http://192.168.101.65:9000")
                    .credentials("minioadmin", "minioadmin").build();

    @Test
    public void upload() {
        try {
            UploadObjectArgs testBucket = UploadObjectArgs.builder()
                    .bucket("testbucket")
                    .object("mxk.jpg")
                    .object("001/mxk.jpg") // 添加子目录
                    .filename("C:\\Users\\irvin\\Pictures\\个人照片\\马新凯生活照.jpg")
                    .contentType("image/jpeg")
                    .build();

            minioClient.uploadObject(testBucket);
            System.out.println("上传成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("上传失败");
        }
    }
}
