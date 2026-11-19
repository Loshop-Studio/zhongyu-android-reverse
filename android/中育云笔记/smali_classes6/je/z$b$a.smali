.class public final Lje/z$b$a;
.super Lje/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/z$b;->f(Lokio/BufferedSource;Lje/t;J)Lje/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lje/t;

.field public final synthetic d:J

.field public final synthetic e:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lje/t;JLokio/BufferedSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje/z$b$a;->c:Lje/t;

    .line 2
    .line 3
    iput-wide p2, p0, Lje/z$b$a;->d:J

    .line 4
    .line 5
    iput-object p4, p0, Lje/z$b$a;->e:Lokio/BufferedSource;

    .line 6
    .line 7
    invoke-direct {p0}, Lje/z;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lje/z$b$a;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Lje/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/z$b$a;->c:Lje/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/z$b$a;->e:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
