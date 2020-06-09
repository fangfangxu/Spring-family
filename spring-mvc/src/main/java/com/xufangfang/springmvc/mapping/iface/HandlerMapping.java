package com.xufangfang.springmvc.mapping.iface;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理器映射器
 */
public interface HandlerMapping {
    Object getHandler(HttpServletRequest request)throws Exception;
}
