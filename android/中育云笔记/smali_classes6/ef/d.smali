.class public final Lef/d;
.super Lje/x;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/gson/Gson;

.field public final b:Lcom/google/gson/TypeAdapter;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lje/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lef/d;->a:Lcom/google/gson/Gson;

    .line 5
    .line 6
    iput-object p2, p0, Lef/d;->b:Lcom/google/gson/TypeAdapter;

    .line 7
    .line 8
    iput-object p3, p0, Lef/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentType()Lje/t;
    .locals 1

    .line 1
    sget-object v0, Lef/b;->d:Lje/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lef/d;->a:Lcom/google/gson/Gson;

    .line 2
    .line 3
    iget-object v1, p0, Lef/d;->b:Lcom/google/gson/TypeAdapter;

    .line 4
    .line 5
    iget-object v2, p0, Lef/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Lef/b;->b(Lokio/BufferedSink;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
