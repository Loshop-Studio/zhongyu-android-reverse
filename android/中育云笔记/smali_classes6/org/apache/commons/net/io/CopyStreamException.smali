.class public Lorg/apache/commons/net/io/CopyStreamException;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, Lorg/apache/commons/net/io/CopyStreamException;->c:J

    .line 8
    .line 9
    return-void
.end method
