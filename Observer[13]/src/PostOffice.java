import java.util.List;

/**
 * Created by viktoriya on 08.03.17.
 */
public class PostOffice implements Observer {
        private boolean got = false;

        @Override
        public boolean getEdition(boolean got) {
            return got;
        }

        @Override
        public void reqEdition(List<Order> orders) {
        }

    }
