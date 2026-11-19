.class public interface abstract La9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/k$a;
    }
.end annotation


# static fields
.field public static final a:La9/k$a;

.field public static final b:La9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La9/k$a;->a:La9/k$a;

    .line 2
    .line 3
    sput-object v0, La9/k;->a:La9/k$a;

    .line 4
    .line 5
    new-instance v0, La9/k$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, La9/k$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, La9/k;->b:La9/k;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(La9/r;)Ljava/util/List;
.end method

.method public abstract b(La9/r;Ljava/util/List;)V
.end method
