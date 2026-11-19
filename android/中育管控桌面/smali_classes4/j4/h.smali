.class public final synthetic Lj4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lj4/k;


# direct methods
.method public synthetic constructor <init>(Lj4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/h;->a:Lj4/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/h;->a:Lj4/k;

    check-cast p1, Landroid/graphics/Rect;

    invoke-static {v0, p1}, Lj4/k;->e(Lj4/k;Landroid/graphics/Rect;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
