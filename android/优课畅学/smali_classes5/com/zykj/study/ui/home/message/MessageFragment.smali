.class public final Lcom/zykj/study/ui/home/message/MessageFragment;
.super Lcom/zykj/study/ui/home/message/Hilt_MessageFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/message/Hilt_MessageFragment<",
        "Lcom/zykj/study/databinding/FragmentMessageBinding;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/message/Hilt_MessageFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_message:I

    .line 2
    .line 3
    return v0
.end method
