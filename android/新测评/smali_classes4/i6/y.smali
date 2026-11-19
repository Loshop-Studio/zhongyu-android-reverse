.class public final synthetic Li6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/y;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Li6/y;->b:Ljava/lang/String;

    iput-boolean p3, p0, Li6/y;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li6/y;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Li6/y;->b:Ljava/lang/String;

    iget-boolean v2, p0, Li6/y;->c:Z

    invoke-static {v0, v1, v2}, Li6/k0;->v(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
