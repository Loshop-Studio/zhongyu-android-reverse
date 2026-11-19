.class public final synthetic Lu6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lu6/b;


# direct methods
.method public synthetic constructor <init>(Lu6/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/a;->a:Lu6/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu6/a;->a:Lu6/b;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lu6/b;->a(Lu6/b;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
