.class public final synthetic Lb8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lb8/q;

.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLb8/q;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb8/o;->a:Z

    iput-object p2, p0, Lb8/o;->b:Lb8/q;

    iput-object p3, p0, Lb8/o;->c:Landroid/net/Uri;

    iput-object p4, p0, Lb8/o;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lb8/o;->a:Z

    iget-object v1, p0, Lb8/o;->b:Lb8/q;

    iget-object v2, p0, Lb8/o;->c:Landroid/net/Uri;

    iget-object v3, p0, Lb8/o;->d:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lb8/q;->m(ZLb8/q;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
