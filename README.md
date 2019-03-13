# BearHoneyBees_Monitor in Java
The Bear and Honeybees Problem (multiple producers - one consumer)

Given are n honeybees and a hungry bear. They share a pot of honey. The pot is initially empty; its capacity is H portions of honey. The bear sleeps until the pot is full, then eats all the 
honey and goes back to sleep. Each bee repeatedly gathers one portion of honey and puts it in the pot; the bee who fills the pot awakens the bear.

Represent the bear and honeybees as concurrent processes or threads (i.e. a "bear" process and an array of "honeybee" processes), and the honey pot as a critical resource (a monitor) that can be accessed by at most one process at a time (either by the "bear" process or by one of the "honeybee" processes). 

A monitor (with condition variables) that represents the pot of honey, to synchronize the actions of the bear and honeybees is developed.
