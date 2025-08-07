#!/bin/bash
echo "Checking BusApp status in Kubernetes..."
kubectl get pods -l app=busapp
kubectl get svc busapp-service
echo "If NodePort is 30086, open http://localhost:30086"
