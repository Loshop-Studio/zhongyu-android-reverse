.class public final synthetic Li6/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic b:Li6/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/x;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Li6/x;->b:Li6/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li6/x;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Li6/x;->b:Li6/l;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Li6/k0;->f(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
