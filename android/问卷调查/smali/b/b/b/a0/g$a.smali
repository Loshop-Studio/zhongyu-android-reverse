.class public Lb/b/b/a0/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/b/a0/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/b/a0/g;->a(Lb/b/b/b0/a;)Lb/b/b/a0/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/b/b/a0/t<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lb/b/b/j;

.field public final synthetic b:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lb/b/b/a0/g;Lb/b/b/j;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p2, p0, Lb/b/b/a0/g$a;->a:Lb/b/b/j;

    iput-object p3, p0, Lb/b/b/a0/g$a;->b:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lb/b/b/a0/g$a;->a:Lb/b/b/j;

    iget-object v1, p0, Lb/b/b/a0/g$a;->b:Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Lb/b/b/j;->a(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
