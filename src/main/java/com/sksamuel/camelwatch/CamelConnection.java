package com.sksamuel.camelwatch;

import java.util.Collection;
import java.util.List;

import com.sksamuel.camelwatch.consumer.ConsumerOperations;
import com.sksamuel.camelwatch.route.Route;
import com.sksamuel.camelwatch.route.RouteOperations;

/**
 * @author Stephen K Samuel samspade79@gmail.com 29 Jun 2012 00:49:49
 * 
 */
public interface CamelConnection {

	CamelBean getConsumer(String consumerId) throws Exception;

	ConsumerOperations getConsumerOperations(String consumerId) throws Exception;

	List<CamelBean> getConsumers() throws Exception;

	List<CamelBean> getContexts() throws Exception;

	List<CamelBean> getEndpoints() throws Exception;

	CamelBean getErrorHandler(String errorHandlerName) throws Exception;

	List<CamelBean> getErrorHandlers() throws Exception;

	Route getRoute(String routeId) throws Exception;

	RouteOperations getRouteOperations(String routeId) throws Exception;

	List<Route> getRoutes() throws Exception;

	Collection<CamelBean> getProcessors(String routeId) throws Exception;

	List<CamelBean> getProcessors() throws Exception;

	CamelBean getComponent(String componentName) throws Exception;

	List<CamelBean> getComponents() throws Exception;

}
