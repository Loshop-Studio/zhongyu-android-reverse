.class public final synthetic Lb8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/net/Uri;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/f;->a:Landroid/net/Uri;

    iput-object p2, p0, Lb8/f;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb8/f;->a:Landroid/net/Uri;

    iget-object v1, p0, Lb8/f;->b:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lb8/q;->l(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
