.class public interface abstract La9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/n$a;
    }
.end annotation


# static fields
.field public static final a:La9/n$a;

.field public static final b:La9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La9/n$a;->a:La9/n$a;

    .line 2
    .line 3
    sput-object v0, La9/n;->a:La9/n$a;

    .line 4
    .line 5
    new-instance v0, La9/n$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, La9/n$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, La9/n;->b:La9/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
