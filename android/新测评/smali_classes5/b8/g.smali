.class public final synthetic Lb8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lb8/q;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lb8/q;Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/g;->a:Lb8/q;

    iput-object p2, p0, Lb8/g;->b:Landroid/net/Uri;

    iput-boolean p3, p0, Lb8/g;->c:Z

    iput-object p4, p0, Lb8/g;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lb8/g;->a:Lb8/q;

    iget-object v1, p0, Lb8/g;->b:Landroid/net/Uri;

    iget-boolean v2, p0, Lb8/g;->c:Z

    iget-object v3, p0, Lb8/g;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lb8/q;->h(Lb8/q;Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
