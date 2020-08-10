package cn.chx;

import cn.chx.utils.FileUtils;

/**
 * @author CaiHexu
 * @date 2020/08/10 10:56
 */
public class Client {
    public static void main(String[] args) {
        FileUtils.fromFileToNewFile("src/resources/orientdb-monitor.log", "src/resources/orientdb-monitor-new.log", "OrientDBCheckThread");

    }
}
