.class public interface abstract Lx0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/q$b;
    }
.end annotation


# static fields
.field public static final a:Lx0/q$b$c;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field

.field public static final b:Lx0/q$b$b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx0/q$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/q$b$c;-><init>(Lx0/q$a;)V

    sput-object v0, Lx0/q;->a:Lx0/q$b$c;

    .line 2
    new-instance v0, Lx0/q$b$b;

    invoke-direct {v0, v1}, Lx0/q$b$b;-><init>(Lx0/q$a;)V

    sput-object v0, Lx0/q;->b:Lx0/q$b$b;

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lx0/q$b$c;",
            ">;"
        }
    .end annotation
.end method
