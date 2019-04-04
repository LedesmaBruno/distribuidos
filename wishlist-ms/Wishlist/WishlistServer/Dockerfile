FROM microsoft/dotnet:sdk
COPY . /app/
WORKDIR /app/WishlistApp
RUN dotnet build
ENTRYPOINT ["dotnet", "run"]