.class public final Lda/d;
.super Li9/c0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/gson/Gson;

.field public final b:Lcom/google/gson/TypeAdapter;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li9/c0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lda/d;->a:Lcom/google/gson/Gson;

    .line 5
    .line 6
    iput-object p2, p0, Lda/d;->b:Lcom/google/gson/TypeAdapter;

    .line 7
    .line 8
    iput-object p3, p0, Lda/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentType()Li9/y;
    .locals 1

    .line 1
    sget-object v0, Lda/b;->d:Li9/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lda/d;->a:Lcom/google/gson/Gson;

    .line 2
    .line 3
    iget-object v1, p0, Lda/d;->b:Lcom/google/gson/TypeAdapter;

    .line 4
    .line 5
    iget-object v2, p0, Lda/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Lda/b;->b(Lokio/BufferedSink;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
