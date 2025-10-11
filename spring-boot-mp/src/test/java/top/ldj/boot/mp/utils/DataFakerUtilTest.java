package top.ldj.boot.mp.utils;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class DataFakerUtilTest {
    @Resource
    private DataFakerUtil dataFakerUtil;
    @Test
    void generateBatch() {
        dataFakerUtil.generateBatch();
    }
}