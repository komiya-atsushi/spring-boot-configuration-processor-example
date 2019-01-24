GRADLE := ./gradlew

run-java-example:
	$(GRADLE) java-example:clean java-example:bootRun

run-kotlin-example:
	$(GRADLE) kotlin-example:clean kotlin-example:bootRun
