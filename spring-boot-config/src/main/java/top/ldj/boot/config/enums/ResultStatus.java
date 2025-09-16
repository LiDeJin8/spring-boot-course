package top.ldj.boot.config.enums;

/**
 * @Author: lenovo
 * @Date: 2025/9/16
 * @Version: 1.0
 */
public enum ResultStatus {
    SUCCESS("成功"), FAIL("失败");

    private  final String info;
    ResultStatus(String info) {
        this.info = info;
    }
}
