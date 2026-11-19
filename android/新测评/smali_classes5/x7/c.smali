.class public final synthetic Lx7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lx7/e;

.field public final synthetic b:Landroid/view/MotionEvent;


# direct methods
.method public synthetic constructor <init>(Lx7/e;Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/c;->a:Lx7/e;

    iput-object p2, p0, Lx7/c;->b:Landroid/view/MotionEvent;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lx7/c;->a:Lx7/e;

    iget-object v1, p0, Lx7/c;->b:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lx7/e;->a(Lx7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
