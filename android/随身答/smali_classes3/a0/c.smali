.class public final synthetic La0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La0/d;


# direct methods
.method public synthetic constructor <init>(La0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/c;->a:La0/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La0/c;->a:La0/d;

    invoke-static {v0}, La0/d;->b(La0/d;)Ln/g;

    move-result-object v0

    return-object v0
.end method
