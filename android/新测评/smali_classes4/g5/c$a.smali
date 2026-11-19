.class public Lg5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/c;->l(Landroid/view/MotionEvent;Landroid/hardware/Camera;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lg5/c;


# direct methods
.method public constructor <init>(Lg5/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/c$a;->b:Lg5/c;

    .line 2
    .line 3
    iput-object p2, p0, Lg5/c$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lg5/c;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "\u624b\u52a8 \u5bf9\u7126\u6210\u529f\uff0c\u83b7\u53d6\u5e27-------->>>>>"

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lg5/c$a;->b:Lg5/c;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lg5/c;->b(Lg5/c;Landroid/hardware/Camera;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lg5/c$a;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
