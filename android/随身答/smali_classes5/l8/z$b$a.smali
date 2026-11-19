.class public final Ll8/z$b$a;
.super Ll8/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll8/z$b;->f(Lokio/BufferedSource;Ll8/t;J)Ll8/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ll8/t;

.field public final synthetic b:J

.field public final synthetic c:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Ll8/t;JLokio/BufferedSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll8/z$b$a;->a:Ll8/t;

    .line 2
    .line 3
    iput-wide p2, p0, Ll8/z$b$a;->b:J

    .line 4
    .line 5
    iput-object p4, p0, Ll8/z$b$a;->c:Lokio/BufferedSource;

    .line 6
    .line 7
    invoke-direct {p0}, Ll8/z;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll8/z$b$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Ll8/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/z$b$a;->a:Ll8/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/z$b$a;->c:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
