.class public final synthetic Lb8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lb8/q;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLb8/q;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb8/p;->a:Z

    iput-object p2, p0, Lb8/p;->b:Lb8/q;

    iput-object p3, p0, Lb8/p;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lb8/p;->a:Z

    iget-object v1, p0, Lb8/p;->b:Lb8/q;

    iget-object v2, p0, Lb8/p;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, Lb8/q;->k(ZLb8/q;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
