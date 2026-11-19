.class public final synthetic Lm5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm5/f;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lm5/f;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/e;->a:Lm5/f;

    iput-object p2, p0, Lm5/e;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm5/e;->a:Lm5/f;

    iget-object v1, p0, Lm5/e;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lm5/f;->i(Lm5/f;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
