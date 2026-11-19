.class public final synthetic Lcom/friday/common/camera/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb2/a;

    check-cast p2, Lb2/a;

    invoke-static {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->g(Lb2/a;Lb2/a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
