.class public final Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/bean/DataStoreManager;->exerciseRevised(Ljava/lang/String;)Ll8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll8/c;"
    }
.end annotation


# instance fields
.field final synthetic $keyName$inlined:Ljava/lang/String;

.field final synthetic $this_unsafeTransform$inlined:Ll8/c;


# direct methods
.method public constructor <init>(Ll8/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;->$keyName$inlined:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;->$keyName$inlined:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;-><init>(Ll8/d;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method
