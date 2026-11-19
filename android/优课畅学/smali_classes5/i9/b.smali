.class public interface abstract Li9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/b$a;
    }
.end annotation


# static fields
.field public static final a:Li9/b$a;

.field public static final b:Li9/b;

.field public static final c:Li9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Li9/b$a;->a:Li9/b$a;

    .line 2
    .line 3
    sput-object v0, Li9/b;->a:Li9/b$a;

    .line 4
    .line 5
    new-instance v0, Li9/b$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Li9/b$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Li9/b;->b:Li9/b;

    .line 11
    .line 12
    new-instance v0, Lk9/a;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lk9/a;-><init>(Li9/q;ILkotlin/jvm/internal/n;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Li9/b;->c:Li9/b;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public abstract a(Li9/f0;Li9/d0;)Li9/b0;
.end method
