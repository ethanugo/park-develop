package com.upto.park.common.tools;

/**
 * 常量名词工具类
 */
public class ConstantUtil {
    private ConstantUtil(){}

    public static class CommonNoun{
        private CommonNoun(){}

        /**
         * 入参
         */
        public static final String REQUEST = "REQUEST : ";

        /**
         * 出参
         */
        public static final String RESPONSE = "RESPONSE : ";

        /**
         * 成功
         */
        public static final String SUCCESS = "success";

        /**
         * 用于日志参数
         */
        public static final String PARAM = "PARAM :";

        /**
         * 结果
         */
        public static final String RESULT = "RESULT :";
    }

    /**
     * 接口返回码
     */
    public static class ResultCode{
        private ResultCode() {}

        /**
         * 接口返回成功
         */
        public static final Integer SUCCESS = 0;

        /**
         * 接口返回失败
         */
        public static final Integer FAIL = 1;

    }
}
