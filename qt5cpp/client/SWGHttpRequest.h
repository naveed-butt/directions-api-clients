/**
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/**
 * Based on http://www.creativepulse.gr/en/blog/2014/restful-api-requests-using-qt-cpp-for-linux-mac-osx-ms-windows
 * By Alex Stylianos
 *
 **/

#ifndef SWG_HTTPREQUESTWORKER_H
#define SWG_HTTPREQUESTWORKER_H

#include <QObject>
#include <QString>
#include <QMap>
#include <QNetworkAccessManager>
#include <QNetworkReply>



namespace Swagger {

enum SWGHttpRequestVarLayout {NOT_SET, ADDRESS, URL_ENCODED, MULTIPART};

class SWGHttpRequestInputFileElement {

public:
    QString variable_name;
    QString local_filename;
    QString request_filename;
    QString mime_type;

};


class SWGHttpRequestInput {

public:
    QString url_str;
    QString http_method;
    SWGHttpRequestVarLayout var_layout;
    QMap<QString, QString> vars;
    QMap<QString, QString> headers;
    QList<SWGHttpRequestInputFileElement> files;
    QByteArray request_body;

    SWGHttpRequestInput();
    SWGHttpRequestInput(QString v_url_str, QString v_http_method);
    void initialize();
    void add_var(QString key, QString value);
    void add_file(QString variable_name, QString local_filename, QString request_filename, QString mime_type);

};


class SWGHttpRequestWorker : public QObject {
    Q_OBJECT

public:
    QByteArray response;
    QNetworkReply::NetworkError error_type;
    QString error_str;

    explicit SWGHttpRequestWorker(QObject *parent = 0);
    virtual ~SWGHttpRequestWorker();

    QString http_attribute_encode(QString attribute_name, QString input);
    void execute(SWGHttpRequestInput *input);
    static QSslConfiguration* sslDefaultConfiguration;

signals:
    void on_execution_finished(SWGHttpRequestWorker *worker);

private:
    QNetworkAccessManager *manager;

private slots:
    void on_manager_finished(QNetworkReply *reply);

};

}

#endif // SWG_HTTPREQUESTWORKER_H
