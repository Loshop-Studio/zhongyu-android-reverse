.class public final synthetic Lw4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw4/f;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lw4/f;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/e;->a:Lw4/f;

    iput-object p2, p0, Lw4/e;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/e;->a:Lw4/f;

    iget-object v1, p0, Lw4/e;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lw4/f;->i(Lw4/f;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
