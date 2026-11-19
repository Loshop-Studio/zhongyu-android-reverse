.class public final synthetic Landroidx/camera/lifecycle/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/AsyncFunction;


# instance fields
.field public final synthetic a:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/lifecycle/a;->a:Lr6/c;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Le1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/lifecycle/a;->a:Lr6/c;

    invoke-static {p1, v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->a(Ljava/lang/Object;Lr6/c;)Le1/a;

    move-result-object p1

    return-object p1
.end method
