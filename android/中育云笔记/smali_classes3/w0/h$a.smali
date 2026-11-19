.class public Lw0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw0/h;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lw0/h;


# direct methods
.method public constructor <init>(Lw0/h;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw0/h$a;->d:Lw0/h;

    .line 2
    .line 3
    iput-object p2, p0, Lw0/h$a;->c:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onDraw()V
    .locals 1

    .line 1
    new-instance v0, Lw0/h$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p0}, Lw0/h$a$a;-><init>(Lw0/h$a;Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ld1/k;->v(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
