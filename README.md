![Static Badge](https://img.shields.io/badge/author-javiergs-orange)
![GitHub repo size](https://img.shields.io/github/repo-size/CSC3100/GUI)
![GitHub Release](https://img.shields.io/github/v/release/CSC3100/GUI)

# MQTT (Message Queuing Telemetry Transport) Example

...
<br>

## Publisher
This class is a simple MQTT publisher that sends messages to a TOPIC; the broker is test.mosquitto.org and the topic is cal-poly/csc/309.
Run this and the subscriber at the same time.
## Subscriber
This class is a simple MQTT subscriber that listens to a TOPIC; the BROKER is test.mosquitto.org and the topic is cal-poly/csc/309.
Run this and the publisher at the same time.

## Publish-Subscriber
This class is a simple MQTT publisher and subscriber (two in one). It publishes messages on two topics and listens to a one of it own topics; the test.mosquitto.org is used as broker. <b>This application can be run alone</b>.

## Blueprint
A drafted class diagram of the current release is as follows:

<p align="center">
<img width="600" src="https://github.com/CSC3100/GUI/assets/3814755/7aea8a30-8bb5-4502-ac32-2607c4f0c2a1">
</p>

