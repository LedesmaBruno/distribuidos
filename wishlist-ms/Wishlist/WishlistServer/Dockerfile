FROM microsoft/dotnet:sdk
COPY . /app/
WORKDIR /app/Main
RUN dotnet build
ENTRYPOINT ["dotnet", "run"]