.class public interface abstract Li9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/n$a;
    }
.end annotation


# static fields
.field public static final a:Li9/n$a;

.field public static final b:Li9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Li9/n$a;->a:Li9/n$a;

    .line 2
    .line 3
    sput-object v0, Li9/n;->a:Li9/n$a;

    .line 4
    .line 5
    new-instance v0, Li9/n$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Li9/n$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Li9/n;->b:Li9/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Li9/w;)Ljava/util/List;
.end method

.method public abstract b(Li9/w;Ljava/util/List;)V
.end method
