GRADLE := ./gradlew

run-java-example:
	$(GRADLE) java-example:clean java-example:bootRun
