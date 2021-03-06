# coding: utf-8

"""
    GraphHopper Directions API

    You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.response_info import ResponseInfo  # noqa: F401,E501
from swagger_client.models.route_response_path import RouteResponsePath  # noqa: F401,E501


class RouteResponse(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'paths': 'list[RouteResponsePath]',
        'info': 'ResponseInfo'
    }

    attribute_map = {
        'paths': 'paths',
        'info': 'info'
    }

    def __init__(self, paths=None, info=None):  # noqa: E501
        """RouteResponse - a model defined in Swagger"""  # noqa: E501

        self._paths = None
        self._info = None
        self.discriminator = None

        if paths is not None:
            self.paths = paths
        if info is not None:
            self.info = info

    @property
    def paths(self):
        """Gets the paths of this RouteResponse.  # noqa: E501


        :return: The paths of this RouteResponse.  # noqa: E501
        :rtype: list[RouteResponsePath]
        """
        return self._paths

    @paths.setter
    def paths(self, paths):
        """Sets the paths of this RouteResponse.


        :param paths: The paths of this RouteResponse.  # noqa: E501
        :type: list[RouteResponsePath]
        """

        self._paths = paths

    @property
    def info(self):
        """Gets the info of this RouteResponse.  # noqa: E501


        :return: The info of this RouteResponse.  # noqa: E501
        :rtype: ResponseInfo
        """
        return self._info

    @info.setter
    def info(self, info):
        """Sets the info of this RouteResponse.


        :param info: The info of this RouteResponse.  # noqa: E501
        :type: ResponseInfo
        """

        self._info = info

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, RouteResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
