.class public final synthetic Lg6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lw5/b;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lw5/b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/j;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lg6/j;->b:Lw5/b;

    iput-boolean p3, p0, Lg6/j;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lg6/j;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lg6/j;->b:Lw5/b;

    iget-boolean v2, p0, Lg6/j;->c:Z

    invoke-static {v0, v1, v2}, Lg6/m;->c(Lkotlin/jvm/functions/Function2;Lw5/b;Z)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
