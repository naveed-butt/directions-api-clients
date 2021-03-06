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


#include "SWGMatrixResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGMatrixResponse::SWGMatrixResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGMatrixResponse::SWGMatrixResponse() {
    init();
}

SWGMatrixResponse::~SWGMatrixResponse() {
    this->cleanup();
}

void
SWGMatrixResponse::init() {
    distances = new QList<QList<SWGNumber*>*>();
    m_distances_isSet = false;
    times = new QList<QList<SWGNumber*>*>();
    m_times_isSet = false;
    weights = new QList<QList<double>*>();
    m_weights_isSet = false;
    info = new SWGResponseInfo();
    m_info_isSet = false;
}

void
SWGMatrixResponse::cleanup() {
    if(distances != nullptr) { 
        auto arr = distances;
        for(auto o: *arr) { 
            for(auto o1: *o) {                
                delete o1;
            }
            delete o;
        }
        delete distances;
    }
    if(times != nullptr) { 
        auto arr = times;
        for(auto o: *arr) { 
            for(auto o1: *o) {                
                delete o1;
            }
            delete o;
        }
        delete times;
    }
    if(weights != nullptr) { 
        auto arr = weights;
        for(auto o: *arr) { 
            for(auto o1: *o) {                
                delete o1;
            }
            delete o;
        }
        delete weights;
    }
    if(info != nullptr) { 
        delete info;
    }
}

SWGMatrixResponse*
SWGMatrixResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMatrixResponse::fromJsonObject(QJsonObject &pJson) {
    
    
    if(pJson["distances"].isArray()){
        auto arr = pJson["distances"].toArray();
        for (const QJsonValue & jval : arr) {
            auto distances_item = new QList<SWGNumber*>();
            
            auto jsonval = jval.toObject();
            ::Swagger::setValue(distances_item, jsonval, "QList", "SWGNumber"); 
            distances->push_back(distances_item);
        }
    }
    
    
    if(pJson["times"].isArray()){
        auto arr = pJson["times"].toArray();
        for (const QJsonValue & jval : arr) {
            auto times_item = new QList<SWGNumber*>();
            
            auto jsonval = jval.toObject();
            ::Swagger::setValue(times_item, jsonval, "QList", "SWGNumber"); 
            times->push_back(times_item);
        }
    }
    
    
    if(pJson["weights"].isArray()){
        auto arr = pJson["weights"].toArray();
        for (const QJsonValue & jval : arr) {
            auto weights_item = new QList<double>();
            
            auto jsonval = jval.toObject();
            ::Swagger::setValue(weights_item, jsonval, "QList", "double"); 
            weights->push_back(weights_item);
        }
    }
    ::Swagger::setValue(&info, pJson["info"], "SWGResponseInfo", "SWGResponseInfo");
    
}

QString
SWGMatrixResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGMatrixResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    if(distances->size() > 0){
        
        QJsonArray jarray;
        for(auto items : *distances){
            QJsonObject jobj;
            toJsonArray((QList<void*>*)items, &jobj, "distances", "SWGNumber");
            
            jarray.append(jobj.value("distances"));
        }
        obj->insert("distances", jarray);
    }
    
    if(times->size() > 0){
        
        QJsonArray jarray;
        for(auto items : *times){
            QJsonObject jobj;
            toJsonArray((QList<void*>*)items, &jobj, "times", "SWGNumber");
            
            jarray.append(jobj.value("times"));
        }
        obj->insert("times", jarray);
    }
    
    if(weights->size() > 0){
        
        QJsonArray jarray;
        for(auto items : *weights){
            QJsonObject jobj;
            toJsonArray((QList<void*>*)items, &jobj, "weights", "double");
            
            jarray.append(jobj.value("weights"));
        }
        obj->insert("weights", jarray);
    }
     
    if((info != nullptr) && (info->isSet())){
        toJsonValue(QString("info"), info, obj, QString("SWGResponseInfo"));
    }

    return obj;
}

QList<QList<SWGNumber*>*>*
SWGMatrixResponse::getDistances() {
    return distances;
}
void
SWGMatrixResponse::setDistances(QList<QList<SWGNumber*>*>* distances) {
    this->distances = distances;
    this->m_distances_isSet = true;
}

QList<QList<SWGNumber*>*>*
SWGMatrixResponse::getTimes() {
    return times;
}
void
SWGMatrixResponse::setTimes(QList<QList<SWGNumber*>*>* times) {
    this->times = times;
    this->m_times_isSet = true;
}

QList<QList<double>*>*
SWGMatrixResponse::getWeights() {
    return weights;
}
void
SWGMatrixResponse::setWeights(QList<QList<double>*>* weights) {
    this->weights = weights;
    this->m_weights_isSet = true;
}

SWGResponseInfo*
SWGMatrixResponse::getInfo() {
    return info;
}
void
SWGMatrixResponse::setInfo(SWGResponseInfo* info) {
    this->info = info;
    this->m_info_isSet = true;
}


bool 
SWGMatrixResponse::isSet(){
    bool isObjectUpdated = false;
    do{
        if(distances->size() > 0){ isObjectUpdated = true; break;}
        if(times->size() > 0){ isObjectUpdated = true; break;}
        if(weights->size() > 0){ isObjectUpdated = true; break;}
        if(info != nullptr && info->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

