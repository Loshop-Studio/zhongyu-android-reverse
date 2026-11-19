.class public interface abstract Li9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/q$a;
    }
.end annotation


# static fields
.field public static final a:Li9/q$a;

.field public static final b:Li9/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Li9/q$a;->a:Li9/q$a;

    .line 2
    .line 3
    sput-object v0, Li9/q;->a:Li9/q$a;

    .line 4
    .line 5
    new-instance v0, Li9/q$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Li9/q$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Li9/q;->b:Li9/q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
