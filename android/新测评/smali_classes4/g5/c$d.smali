.class public Lg5/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg5/c;


# direct methods
.method public constructor <init>(Lg5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/c$d;->a:Lg5/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lg5/c$d;->a:Lg5/c;

    .line 2
    .line 3
    invoke-static {p1}, Lg5/c;->f(Lg5/c;)Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-wide/16 v0, 0x5dc

    .line 8
    .line 9
    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
