package test.logic;

import test.models.PointDomain;

import java.io.IOException;

public class PointRuleEngineImpl implements PointRuleEngine {
    @Override
    public void initEngine() {
        // 设置时间格式
        System.setProperty("drools.dateformat", "yyyy-MM-dd HH:mm:ss");

    }

    @Override
    public void refreshEnginRule() {

    }

    @Override
    public void executeRuleEngine(PointDomain pointDomain) {

    }
}
