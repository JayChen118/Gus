package za.co.riggaroo.gus.data;

import java.util.List;

import rx.Observable;
import za.co.riggaroo.gus.data.remote.model.User;

/**
 * Created by Administrator on 2016/11/1.
 */

public interface UserRepository {

    public Observable<List<User>> searchUsers(final String searchTerm);
}
