.class public Lu2/a;
.super Lt2/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt2/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lz2/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, La3/a;

    invoke-direct {v0}, La3/a;-><init>()V

    return-object v0
.end method
