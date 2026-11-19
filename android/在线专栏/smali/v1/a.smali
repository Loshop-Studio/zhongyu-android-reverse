.class public final Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/download/DownloadFlag;)I
    .locals 1
    .param p1    # Lcom/zykj/download/DownloadFlag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "flag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    return p1
.end method

.method public final b(I)Lcom/zykj/download/DownloadFlag;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lcom/zykj/download/DownloadFlag;->values()[Lcom/zykj/download/DownloadFlag;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method
