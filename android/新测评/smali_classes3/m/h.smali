.class public final synthetic Lm/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lm/h;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lm/h;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/h;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lm/h;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lm/h;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcoil3/compose/AsyncImagePainter$c;

    invoke-static {v0, v1, v2, p1}, Lm/j;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcoil3/compose/AsyncImagePainter$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
