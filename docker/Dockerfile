FROM registry.cn-shanghai.aliyuncs.com/c7n/javabase:0.10.0
RUN mkdir /choerodon && chown -R www-data:www-data /choerodon
COPY --chown=www-data:www-data app.jar /choerodon/choerodon-gateway.jar
WORKDIR /choerodon
USER 33
CMD java $JAVA_OPTS $SKYWALKING_OPTS -jar /choerodon/choerodon-gateway.jar